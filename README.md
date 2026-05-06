# harbor-svc-queue-mesh

`harbor-svc-queue-mesh` explores backend services with a small Kotlin codebase and local fixtures. The technical goal is to design a Kotlin verification harness for queue systems, covering state machine modeling, transition tables, and failure-oriented tests.

## Use Case

The point is to make a small domain rule concrete enough that a reader can change it and immediately see what broke.

## Harbor Svc Queue Mesh Review Notes

The first comparison I would make is `queue pressure` against `queue pressure` because it shows where the rule is most opinionated.

## Highlights

- `fixtures/domain_review.csv` adds cases for queue pressure and retry load.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/harbor-svc-queue-walkthrough.md` walks through the case spread.
- The Kotlin code includes a review path for `queue pressure` and `queue pressure`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Code Layout

The implementation keeps the scoring rule plain: reward signal and confidence, preserve slack, penalize drag, then classify the result into a review lane.

The Kotlin code keeps the review rule close to the tests.

## Run The Check

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Regression Path

The check exercises the source code and the review fixture. `baseline` is the high score at 224; `stale` is the low score at 136.

## Future Work

The repository is intentionally scoped to local checks. I would expand it by adding adversarial fixtures before adding features.
