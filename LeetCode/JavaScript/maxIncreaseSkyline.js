/**
 * @param {number[][]} grid
 * @return {number}
 */

var maxIncreaseKeepingSkyline = function (grid) {

  let len = grid.length;

  const maxI = [];
  const maxJ = [];

  for (let i = 0; i < len; i++) {
    for (let j = 0; j < len; j++) {
      maxI[i] = Math.max(maxI[i] || 0, grid[i][j]); //find Max val for ROW I
      maxJ[j] = Math.max(maxJ[j] || 0, grid[i][j]); //find Max val for COL J
    }
  }
  console.log(maxI, maxJ);

  let counter = 0;

  for (let i = 0; i < len; i++) {
    for (let j = 0; j < len; j++) {
      counter += Math.min(maxI[i], maxJ[j]) - grid[i][j]; //incrementally update the counter to add the possible increment to the grid
    }
  }

  return counter;
};