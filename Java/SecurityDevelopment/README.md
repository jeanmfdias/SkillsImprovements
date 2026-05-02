# Security Development

Small Java exercises around safe handling of external resources.

## Programs

- [UploadLimitSize.java](src/UploadLimitSize.java) — downloads an image over HTTP into `./out/`, checks whether its size exceeds a 1 MB threshold, and deletes the temporary file. Demonstrates streaming with `BufferedInputStream` / `FileOutputStream` and using `Files.delete` for cleanup.

## Run

The program writes to `./out/` — create it first.

```
mkdir -p out
javac -d out src/UploadLimitSize.java
java -cp out UploadLimitSize
```

Requires internet access.
