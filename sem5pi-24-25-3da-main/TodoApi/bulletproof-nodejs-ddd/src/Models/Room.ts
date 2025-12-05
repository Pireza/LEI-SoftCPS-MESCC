import mongoose, { Schema } from "mongoose";
import { IRoom } from "./Interfaces/RoomInterface";

const RoomSchema: Schema<IRoom> = new mongoose.Schema(
    {
        name: { type: String, required: true, unique : true },              // Room name
        type: { type: String, required: true, unique : false},              // Room type (e.g., consultation, surgery)
        capacity: { type: Number, required: true, unique : false},          // Room capacity
        location: { type: String, required: true, unique : false },          // Room location or identifier
    },
);

const Room = mongoose.model<IRoom>('Room', RoomSchema);
export default Room;
