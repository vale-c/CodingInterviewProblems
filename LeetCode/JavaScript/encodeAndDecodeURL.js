/**
 * Encodes a URL to a shortened URL.
 *
 * @param {string} longUrl
 * @return {string}
 */
const urlMap = new Map();
let id = 0;

var encode = function(longUrl) {
  if (!urlMap.has(longUrl)) {
    urlMap.set(longUrl, id++);
  }
  return `http://tinyurl.com/${urlMap.get(longUrl)}`;
};

/**
* Decodes a shortened URL to its original URL.
*
* @param {string} shortUrl
* @return {string}
*/
var decode = function(shortUrl) {
  const key = shortUrl.split('/').pop();
  for (const [url, value] of urlMap.entries()) {
    if (value == key) {
      return url;
    }
  }
  return '';
};

/**
* Your functions will be called as such:
* decode(encode(url));
*/

/*
Time Complexity:
- Encode: O(1) on average for insertion and retrieval in a hash map.
- Decode: O(n) in the worst case, where n is the number of URLs stored.

Space Complexity:
- O(n) for storing the mapping of URLs in the hash map.
*/