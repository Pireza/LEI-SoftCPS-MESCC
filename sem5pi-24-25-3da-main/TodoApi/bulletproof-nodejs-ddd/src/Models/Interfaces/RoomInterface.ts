import { Document } from "mongoose";

interface IRoom extends Document {
  name: string;
  type: string;
  capacity: number;
  location: string;
}

export { IRoom };
