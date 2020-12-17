import React from 'react';
import Avatar from '../Avatar';
import './Card.css';

function Card({ data }) {
  return (
    <div class="card">
      <Avatar data={data.user} />

      {data.type === 'image'
        ? <img src={data.content} alt="" />
        : <p className="card__text">{data.content}</p>}
    </div>
  );
}

export default Card;
