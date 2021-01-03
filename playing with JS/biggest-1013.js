var input = require('fs').readFileSync('test case', 'utf8');

var values = input.split('\n');

const a = parseInt(values.shift());
const b = parseInt(values.shift());
const c = parseInt(values.shift());

const listAsc = [a, b, c].sort((a, b)=> a - b);

const returnTheBiggest = prop => console.log(prop, 'eh o maior')

returnTheBiggest(listAsc[2])