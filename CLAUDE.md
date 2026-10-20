# CLAUDE.md

Personal competitive-programming practice: solutions to Codeforces problems, written in Java, for college CP.

## Layout and naming

- One self-contained Java file per problem at the repo root, named `P<contest><index>_<ProblemName>.java` with a matching public class — e.g. `P4A_Watermelon.java` → `public class P4A_Watermelon`.
- `problem_4A` is an empty placeholder file from an earlier commit; the real solution is `P4A_Watermelon.java`.

## Run a solution

```bash
javac P4A_Watermelon.java && echo "8" | java P4A_Watermelon
```

Test against the sample inputs from the problem page before calling a solution done. Codeforces submits a single file, so keep each solution in one file with no package declaration and no external dependencies.

## How to help here

- This repo is for learning. Unless asked for the full answer, explain the idea or give a hint first, then let the owner write the code.
- When writing or reviewing a solution, state the time/space complexity and check it against the problem's limits (roughly 10^8 simple operations per second).
- For large inputs prefer `BufferedReader`/`StringTokenizer` and `PrintWriter` over `Scanner` and repeated `System.out.println`.
- Watch for `int` overflow — use `long` when values can exceed ~2·10^9.
