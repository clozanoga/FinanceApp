import { GET_MARKETWATCH } from "../actions/types";

const initialState = {
  markets: [],
  market: {}
};

export default function(state = initialState, action) {
  switch (action.type) {
    case GET_MARKETWATCH:
      return {
        ...state,
        markets: action.payload
      };
    default:
      return state;
  }
}
