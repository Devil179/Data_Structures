#include <stdio.h>

int main() {
#ifdef __linux__
  printf("Linux\n");
#else
  printf("Not Linux\n");
#endif
  return 0;
}
