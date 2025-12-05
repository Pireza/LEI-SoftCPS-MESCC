import RoomRepository from "../repos/RoomRepository";
import { IRoom } from "../Models/Interfaces/RoomInterface";

class RoomService {
  async createRoom(room: IRoom): Promise<IRoom> {
    return await RoomRepository.createRoom(room);
  }

  async getAllRooms(): Promise<IRoom[]> {
    return await RoomRepository.getAllRooms();
  }
  
}

export default new RoomService();
