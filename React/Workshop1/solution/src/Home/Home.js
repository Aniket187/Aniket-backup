import React from 'react';
import Card from '../Card';
import { cards } from './cards';
import './Home.css';

function Home() {
  return (
    <div id="home">
      {cards.map(card => <Card data={card} key={card.id} />)}
    </div>
  );
}

export default Home;
