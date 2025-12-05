import { Component, OnInit } from '@angular/core';
import { AuthService } from '../../services/auth.service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-update-surgery-appointment',
  templateUrl: './update-surgery-appointment.component.html',
  styleUrls: ['./update-surgery-appointment.component.css'],
  imports: [FormsModule, CommonModule],
  standalone: true,
})
export class UpdateSurgeryAppointmentComponent implements OnInit {
  appointments: any[] = []; // Stores the list of appointments
  appointment: any = {
    id: '',
    RoomId: '',
    Date: '',
    Status: '',
  }; // Model for the appointment being updated
  successMessage: string = ''; // Success message for UI feedback
  errorMessage: string = ''; // Error message for UI feedback

  constructor(private authService: AuthService) {}

  ngOnInit(): void {
    this.loadAppointments();
  }

  // Fetch all appointments from the backend
  loadAppointments(): void {
    this.authService.getAllAppointments().subscribe(
      (response) => {
        if (response && Array.isArray(response.data)) {
          console.log('Loaded appointments:', response.data);
          this.appointments = response.data;
        } else {
          console.error('Invalid data format for appointments:', response);
          this.errorMessage = 'Failed to load appointments due to invalid response format.';
          this.clearMessagesAfterDelay();
        }
      },
      (error) => {
        console.error('Error loading appointments', error);
        this.errorMessage = 'Failed to load appointments.';
        this.clearMessagesAfterDelay();
      }
    );
  }

  // Select an appointment to populate the form for editing
  selectAppointment(appointment: any): void {
    this.appointment = {
      id: appointment._id, // Use the `_id` field returned by MongoDB
      RoomId: appointment.RoomId,
      Date: appointment.Date,
      Status: appointment.Status,
    };
  }

  // Update the selected appointment
  updateAppointment(): void {
    if (!this.appointment.id) {
      this.errorMessage = 'Appointment ID is required.';
      this.clearMessagesAfterDelay();
      return;
    }

    const updatedData: { RoomId?: string; Date?: string; Status?: string } = {};
    if (this.appointment.RoomId) {
      updatedData.RoomId = this.appointment.RoomId;
    }
    if (this.appointment.Date) {
      updatedData.Date = this.appointment.Date;
    }
    if (this.appointment.Status) {
      updatedData.Status = this.appointment.Status;
    }

    this.authService.updateAppointment(this.appointment.id, updatedData).subscribe(
      (response) => {
        console.log('Appointment updated successfully:', response);
        this.successMessage = 'Appointment updated successfully!';
        this.loadAppointments(); // Refresh the list of appointments
        this.resetForm(); // Clear the form
        this.clearMessagesAfterDelay();
      },
      (error) => {
        console.error('Error updating appointment:', error);
        this.errorMessage = 'Failed to update appointment. Please try again later.';
        this.clearMessagesAfterDelay();
      }
    );
  }

  // Reset the form to its default state
  resetForm(): void {
    this.appointment = { id: '', RoomId: '', Date: '', Status: '' };
  }

  // Clear messages after a delay for better UI experience
  clearMessagesAfterDelay(): void {
    setTimeout(() => {
      this.successMessage = '';
      this.errorMessage = '';
    }, 3000);
  }
}
