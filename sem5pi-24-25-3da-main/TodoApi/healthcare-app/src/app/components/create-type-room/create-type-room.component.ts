import { Component, OnInit } from '@angular/core';
import { AuthService } from '../../services/auth.service';  
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-create-room',
  templateUrl: './create-type-room.component.html',
  styleUrls: ['./create-type-room.component.css'],
  imports: [FormsModule, CommonModule],
  standalone: true
})
export class CreateTypeRoomComponent implements OnInit {
  room: any = {
    name: '',
    type: '',
    capacity: '',
    location: ''
  };
  errorMessage: string = '';
  successMessage: string = '';

  constructor(private authService: AuthService) {}

  ngOnInit(): void {
    // No need for loadRequests as it isn't required
  }

  // Method to create a new room
  createRoom() {
    this.authService.createRoom(
      this.room.name,
      this.room.type,
      this.room.capacity,
      this.room.location
    ).subscribe(
      (response) => {
        this.successMessage = 'Room created successfully!';
        this.resetForm();
      },
      (error) => {
        this.errorMessage = 'Failed to create room.';
      }
    );
  }
  

  // Reset form data after a successful creation
  resetForm() {
    this.room = { name: '', type: '', capacity: '', location: '' };
  }

  // Clear error and success messages after a delay
  clearMessagesAfterDelay() {
    setTimeout(() => {
      this.errorMessage = '';
      this.successMessage = '';
    }, 3000);
  }
}
