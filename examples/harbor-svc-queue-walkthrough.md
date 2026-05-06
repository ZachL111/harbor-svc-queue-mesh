# Harbor Svc Queue Mesh Walkthrough

I use this file as a small checklist before changing the Kotlin implementation.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | queue pressure | 224 | ship |
| stress | retry load | 213 | ship |
| edge | worker slack | 151 | ship |
| recovery | session drift | 174 | ship |
| stale | queue pressure | 136 | watch |

Start with `baseline` and `stale`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

If `stale` becomes less cautious without a clear reason, I would inspect the drag input first.
