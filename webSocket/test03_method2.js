const WebSocket = require('ws');

const ws = new WebSocket('wss://stream.binance.com:9443/ws/!ticker@arr');

ws.on('open', function open(data) {
  var connectionStartTime = Date.now();
// timestamp in milliseconds
  console.log(connectionStartTime);
});

ws.on('message', function incoming(data) {
  console.log(JSON.parse(data));
});