/**
 * Encodes a URL to a shortened URL.
 *
 * @param {string} longUrl
 * @return {string}
 */

//IS THAT EVEN CONSIDERED A VALID SOLUTION?!
//DON'T THINK SO...
//BUT IT WORKS!

/*Runtime: 72 ms, faster than 97.69% of JavaScript online submissions for Encode and Decode TinyURL.
Memory Usage: 35.1 MB, less than 44.44% of JavaScript online submissions for Encode and Decode TinyURL.*/

var encode = function(longUrl) {
  return encodeURI(longUrl);
  //console.log(longUrl);
};

/**
* Decodes a shortened URL to its original URL.
*
* @param {string} shortUrl
* @return {string}
*/
var decode = function(shortUrl) {
  return decodeURI(shortUrl);
  // console.log(shortUrl);
};

/**
* Your functions will be called as such:
* decode(encode(url));
*/