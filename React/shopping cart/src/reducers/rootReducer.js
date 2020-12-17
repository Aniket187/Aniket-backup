import { combineReducers } from "redux";
import productReducer from "./productReducer";
import myCartReducer from "./myCartReducer";

const allReducers = combineReducers({ productReducer, myCartReducer });

export default allReducers;
