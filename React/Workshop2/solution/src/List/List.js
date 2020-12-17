import React, { Component } from "react";
import "./List.css";

class List extends Component {
  state = {
    users: []
  };

  componentDidMount() {
    this.fetchData();
  }

  fetchData() {
    fetch("https://jsonplaceholder.typicode.com/users")
      .then(res => res.json())
      .then(data => this.setState({ users: data }));
  }

  render() {
    return (
      <div className="List">
        <p>Devs:</p>
        {
          this.state.users.map(user => (
          <div key={user.id} onClick={() => this.props.onClick(user.id)}>
            
            {user.username}
          
          </div>
        ))}
      </div>
    );
  }
}

export default List;
