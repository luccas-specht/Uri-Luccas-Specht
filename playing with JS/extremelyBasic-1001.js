var input = require('fs').readFileSync('test case', 'utf8');

var values = input.split('\n');

var a = parseInt(values.shift());
var b = parseInt(values.shift());

console.log('X =', a + b);