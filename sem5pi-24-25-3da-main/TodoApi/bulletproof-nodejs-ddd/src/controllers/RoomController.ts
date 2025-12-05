import { Request, Response } from "express";
import RoomService from "../services/RoomService";

class RoomController {
  async createRoom(req: Request, res: Response): Promise<void> {
    console.log("createRoom endpoint hit with body:", req.body);
    try {
      const room = await RoomService.createRoom(req.body);
      res.status(201).json({ success: true, room });
    } catch (error) {
      console.error("Error in createRoom:", error);
      res.status(500).json({ success: false, message: "Failed to create room", error });
    }
  }

  async getAllRooms(req: Request, res: Response): Promise<void> {
    try {
      const rooms = await RoomService.getAllRooms();
      res.status(200).json({ success: true, rooms });
    } catch (error) {
      console.error("Error in getAllRooms:", error);
      res.status(500).json({ success: false, message: "Failed to fetch rooms", error });
    }
  }
  
}

export default new RoomController();


