import React, { Component } from 'react';
import List from '../List';
import Details from '../Details';
import Shortlist from '../Shortlist';
import './App.scss';

class App extends Component {
  state = {
    selectedUserId: null,
    shortlistedUsers: []
  };

  handleUserClick = (userId) => {
    this.setState({ selectedUserId: userId });
  };

  handleShortlist = (user) => {
    this.setState(state => ({
      shortlistedUsers: [...state.shortlistedUsers, user]
    }));
  }

  handleShorlistRemove = (userId) => {
    this.setState(state => ({
      shortlistedUsers: state.shortlistedUsers.filter(user => user.id !== userId)
    }));
  };

  render() {
    const { selectedUserId, shortlistedUsers } = this.state;

    return (
      <div className="App">
        <List onClick={this.handleUserClick} />

        <Details
          userId={selectedUserId}
          onShortlist={this.handleShortlist} />

        <Shortlist
          users={shortlistedUsers}
          onRemove={this.handleShorlistRemove} />
      </div>
    );
  }
}

export default App;
