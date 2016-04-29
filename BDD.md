#WordApp Behavior BDD#

| Behavoir                                                                  | Input                               | Output                        |
| --------------------------------------------------------------------------|:-----------------------------------:| -----------------------------:|
| WordApp inputs a Word to their dictionary.                                | Banana                              | True                          |
| WordApp inputs a Word to their dictionary.And the word is stored.         | Banana                              |  Banana                       |
| WordApp adds multiple words to their dictionary.                          | Banana, Apple                       | Banana, Apple   |
| WordApp clears dictionary.                                                | Banana                              |0|
| WordApp adds multiple words to their dictionary and gets id.              | Banana                              |1|
| WordApp adds multiple words to their dictionary and checks id.            | Banana, Apple                       |true|
| WordApp looks at entire dictionary and checks for a out of bounds input.  | Banana, Apple                       |true|
|                                           |                |         |
|                                           |                |         |
