import React from "react";
import ReactDOM from "react-dom";
import App from "./App";
import "./styles.css";
import rootReducer from "./reducers/rootReducer";
import { Provider } from "react-redux";
import { createStore } from "redux";

const store = createStore(rootReducer);

const rootElement = document.getElementById("root");
ReactDOM.render(
  <Provider store={store}>
    <App />
  </Provider>,
  rootElement
);
