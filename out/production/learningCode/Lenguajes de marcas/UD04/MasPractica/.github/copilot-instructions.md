<!-- Copilot instructions for contributors and AI agents -->
# Guidance for AI coding agents

This repository is a small collection of static HTML exercises organized into two folders: `serie 1/` and `serie 2/` (e.g. `serie 1/ej1.html`, `serie 2/ejercicio3.html`). There is no build system, package manager, or tests.

Keep edits minimal, explicit, and reversible. Below are actionable rules to be productive here.

- Purpose: This repo contains student/practice HTML files. Treat each `.html` as a single-source exercise page.
- Scope of edits: Make small, non-invasive fixes (typo, accessibility, minor markup improvements). Do NOT introduce frameworks, bundlers, or new build files.
- Filenames and folders: Preserve file names and folder structure. Do not rename or move files unless the user explicitly requests it.
- Encoding and DOCTYPE: Keep `<!DOCTYPE html>` and UTF-8 encoding. Avoid changing top-level declarations.
- Language / comments: Files may contain Spanish text; preserve original wording unless correcting clear mistakes.

Editing conventions and examples
- When changing a file, add a short HTML comment at the top describing the change and WHY, e.g.:
  <!-- Fix: corrected alt text for accessibility (why: missing alt prevents screenreader access) -->
- Example safe change: update `serie 2/ejercicio3.html` to add `alt` attributes to images or fix broken links.
- Example NOT allowed without confirmation: converting files to a React app, adding `package.json`, or moving exercises into a new folder.

Discovery notes (what to expect when exploring this repo)
- Files: flat HTML files in `serie 1/` and `serie 2/` — search these dirs for the student's work.
- No CI/build: There is no automated test or build configuration to run; validate changes by opening the file in a browser.

PR and communication guidance
- Keep PRs focused: one exercise per PR when making content or markup changes.
- Explain intent: PR descriptions must state the motivation and list changed files.
- When in doubt, open an issue or ask the repo owner before making structural changes.

If you need more context
- Ask the user which exercises are source-of-truth for grading or demonstration before large edits.
- If asked to add tooling (linters, formatter), request permission and which tools to use.

Files to inspect for patterns: `serie 1/ej1.html`, `serie 1/ej2.html`, `serie 2/ejercicio1.html`, `serie 2/ejercicio3.html`.

If any of these points are ambiguous, ask a clarifying question before applying changes.
