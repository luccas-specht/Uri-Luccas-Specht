const input = require('fs').readFileSync('test case', 'utf8');

var values = input.split('\n');

const radius = parseFloat(values.shift());
const N = 3.14159;

const calCircleRadius = () => console.log('A='+(N * (radius * radius)).toFixed(4))

calCircleRadius();