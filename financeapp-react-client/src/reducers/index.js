import { combineReducers } from "redux";
import errorReducer from "./errorReducer";
import marketWatchReducer from "./MarketWatchReducer";

export default combineReducers({
  errors: errorReducer,
  market: marketWatchReducer
});
