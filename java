javascript

  { name: "PUM", price: "0.00000123" },
  { name: "BONK", price: "0.00000045" },
  { name: "RADIUM", price: "0.00001234" },
];


const container = document.getElementById("coins-container");

memecoins.forEach(coin => {
  const div = document.createElement("div");
  div.className = "coin";
  div.style.marginBottom = "15px";
  div.innerHTML = `
    <strong>coin.name</strong> - Price:{coin.price}
    <button onclick="buyCoin('coin.name')">Buy</button>
    <br/>
  `;
  container.appendChild(div);
);

// Simulacija kupovine
function buyCoin(name) 
  alert(Buying{name}... (simulated));
}
```
