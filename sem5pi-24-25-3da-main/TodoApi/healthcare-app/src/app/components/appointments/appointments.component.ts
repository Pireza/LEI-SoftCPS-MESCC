import { Component, OnInit } from '@angular/core';
import { AuthService } from '../../services/auth.service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { concatMap } from 'rxjs/operators';

@Component({
  selector: 'app-appointments',
  templateUrl: './appointments.component.html',
  styleUrls: ['./appointments.component.css'],
  imports: [FormsModule, CommonModule],
  standalone: true
})
export class AppointmentsComponent implements OnInit {
  requests: any[] = [];
  rooms: any[] = [];  // Variável correta para armazenar os rooms
  appointment: any = {
    RequestId: '',
    RoomId: '',  // Mantém o RoomId no appointment, que será selecionado no dropdown
    Date: '',
    Status: ''
  };
  errorMessage: string = '';

  constructor(private authService: AuthService) {}

  ngOnInit(): void {
    this.loadRequests();
    this.loadRooms();  // Carrega os rooms ao iniciar
  }

  private loadRequests(): void {
    this.authService.getAllRequests().subscribe(
      (data) => {
        if (Array.isArray(data)) {
          console.log('Loaded operation requests:', data);
          this.requests = data;
        } else {
          console.error('Invalid data format for operation requests:', data);
        }
      },
      (error) => {
        console.error('Error loading requests', error);
        alert('Failed to load operation requests');
      }
    );
  }

  private loadRooms(): void {
    this.authService.getRooms().subscribe(
      (data) => {
        if (data && Array.isArray(data.rooms)) {  // Check if rooms exist and is an array
          console.log('Loaded rooms:', data.rooms);
          this.rooms = data.rooms;  // Extract rooms from the response
        } else {
          console.error('Invalid data format for rooms:', data);
        }
      },
      (error) => {
        console.error('Error loading rooms', error);
        alert('Failed to load rooms');
      }
    );
  }
  
  createAppointment() {
    this.authService.createAppointments(this.appointment).subscribe(
      () => {
        alert('Appointment created successfully');
        this.resetForm();
      },
      (error: any) => this.errorMessage = 'Failed to create appointment.'
    );
  }

  resetForm() {
    this.appointment = { RequestId: '', RoomId: '', Date: '', Status: '' };
  }

  clearMessagesAfterDelay() {
    setTimeout(() => this.errorMessage = '', 3000);
  }
}
