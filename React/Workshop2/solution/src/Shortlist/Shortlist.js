import React, { Component } from 'react';
import './Shortlist.css';

class Shortlist extends Component {
  render() {
    return (
      <div className="Shortlist">
        <p>Shortlist:</p>
        {this.props.users.map(user => (
          <div>
            {user.name}
            <button onClick={() => this.props.onRemove(user.id)}>X</button>
          </div>
        ))}
      </div>
    );
  }
}

export default Shortlist;
