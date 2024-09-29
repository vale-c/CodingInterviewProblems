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

// Time Complexity: O(n^2) - We traverse the grid twice, where n is the length of one side of the grid.
// Space Complexity: O(n) - We use two additional arrays to store the maximum values for rows and columns.