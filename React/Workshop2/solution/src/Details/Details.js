import React, { Component } from "react";
import "./Details.css";

class Details extends Component {
  state = {
    user: null
  };

  componentDidUpdate(prevProps) {
    if (prevProps.userId !== this.props.userId) {
      this.fetchData();
    }
  }

  fetchData() {
    fetch(`https://jsonplaceholder.typicode.com/users/${this.props.userId}`)
      .then(res => res.json())
      .then(data => this.setState({ user: data }));
  }

  render() {
    const { user } = this.state;

    return (
      <div className="Details">
        {user ? (
          <div>
            <h1>
              {user.name} <small>({user.username})</small>
            </h1>
            <p>Email: {user.email}</p>
            <p>Location: {user.address.city}</p>

            <button onClick={() => this.props.onShortlist(user)}>
              Shortlist
            </button>
          </div>
        ) : (
          <h1>No Dev Selected</h1>
        )}
      </div>
    );
  }
}
export default Details;