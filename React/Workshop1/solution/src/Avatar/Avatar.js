import React from 'react';
import './Avatar.css';

function Avatar({ data }) {
  return (
    <div className="avatar">
      <div className="avatar__image">
        <img src={data.image ? data.image : 'avatar.png'} alt="" />
      </div>
      <p>{data.name}</p>
    </div>
  );
}

export default Avatar;
