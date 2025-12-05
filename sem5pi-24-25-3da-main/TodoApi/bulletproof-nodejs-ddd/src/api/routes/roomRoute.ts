// src/routes/roomRoutes.ts
import express from "express";
import RoomController from "../../controllers/RoomController";

const router = express.Router();

// Route to create a new room
router.post("/api/createRoom", RoomController.createRoom);

router.get("/api/getAllRooms", RoomController.getAllRooms);


export default router;
