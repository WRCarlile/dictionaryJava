#DefineApp Behavior BDD#

| Behavoir                                                                  | Input                               | Output                        |
| --------------------------------------------------------------------------|:-----------------------------------:| -----------------------------:|
| WordApp inputs a Word to their dictionary.                                | Banana                              | True                          |
| WordApp inputs a Word to their dictionary.And the word is stored.         | Banana                              |  Banana                       |
| WordApp adds multiple words to their dictionary.                          | Banana, Apple                       | Banana, Apple   |
| WordApp clears dictionary.                                                | Banana                              |0|
| WordApp adds multiple words to their dictionary and gets id.              | Banana                              |1|
| WordApp adds multiple words to their dictionary and checks id.            | Banana, Apple                       |true|
| WordApp looks at entire dictionary and checks for a out of bounds input.  | Banana, Apple                       |true|

#DefineApp Behavior BDD#

| Behavoir                                                                               | Input                               | Output                        |
| --------------------------------------------------------------------------             |:-----------------------------------:| -----------------------------:|
| DefineApp inputs a definition to their word.                                | banana definition                             | True                          |
| DefineApp inputs a definition to their word and the definition is stored.         | banana definition                            |  banana definition                     |
| DefineApp adds multiple definitions to their word.                          | banana definition                      | banana definition, apple definition  |
| DefineApp clears dictionary and definitions.                                                | banana definition                             |0|
| DefineApp adds multiple words to their dictionary and gets id.              | banana definition                             |1|
| DefineApp adds multiple words to their dictionary and checks id.            | banana definition, apple definition                      |true|
| DefineApp looks at entire dictionary and checks for a out of bounds input.  | banana definition, apple definition                      |true|
