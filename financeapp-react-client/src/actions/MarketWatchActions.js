import axios from "axios";
import { GET_MARKETWATCH } from "./types";

export const getMarketWatch = () => async dispatch => {
  const res = await axios.get("http://localhost:8080/api/markets/marketwatch");
  dispatch({
    type: GET_MARKETWATCH,
    payload: res.data
  });
};
