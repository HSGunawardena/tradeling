const api = require('binance');

const binanceWS = new api.BinanceWS(true);

//Data stream is available
binanceWS.onDepthUpdate('ETHBTC', (data) => {
    console.log(data);
});