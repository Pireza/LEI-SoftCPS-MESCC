import { IRoom } from "../Models/Interfaces/RoomInterface";
import Room from "../Models/Room";

class RoomRepository {
  async createRoom(roomData: IRoom): Promise<IRoom> {
    const room = new Room(roomData);
    return await room.save();
  }

  async getAllRooms(): Promise<IRoom[]> {
    return await Room.find();
  }
  
}

export default new RoomRepository();
