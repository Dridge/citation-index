# citation-index

A small citation algorithm (h-index).

A H-Index calculator, measured the productivity and citation impact of a researcher.

Given a list of published and cited research papers, find **the largest** number "h" which has
been published "h" times, and cited **at least** "h" times.

## Inputs

The inputs should be a list of integers from 0-99. But, we can't guarantee the inputs will be valid.

## Solutions

Consider writing an initial solution and then solve it differently perhaps catering for performance
or smallest possible memory usage. 

## Testing

Write tests for each solution, and ideally write a test to verify your performance or memory
focused solutions work.

## Examples

- Published papers:\
  A, B, C, D, E, F, G, H, I
- Which have been cited this many times:\
  1, 5, 2, 5, 3, 1, 5, 5, 6

Then their h-index is five, for the papers: B, D, G, H, and I. Because they have published more
than five papers, and five of their papers have been cited five times or more.

Conversely, if they had only published the first four papers: A, B, C, and D. Then their h-index
would be two. Due to the papers: B, C, and D. Five is greater than the total number of
published papers, so it is excluded, leaving only the two citations from paper C being applicable.

## Future improvements

- memory constraints?
- fastest response?
- multithreading?
