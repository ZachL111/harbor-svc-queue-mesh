# Review Journal

The review surface for `harbor-svc-queue-mesh` is deliberately narrow: one fixture, one scoring rule, and one local check.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its backend services focus without claiming live deployment or external usage.

## Cases

- `baseline`: `queue pressure`, score 224, lane `ship`
- `stress`: `retry load`, score 213, lane `ship`
- `edge`: `worker slack`, score 151, lane `ship`
- `recovery`: `session drift`, score 174, lane `ship`
- `stale`: `queue pressure`, score 136, lane `watch`

## Note

A future change should add new cases before it changes the scoring rule.
