# EManager

A Java-based entity/expense manager with calendar integration — built to track, organize, and manage records with date-aware functionality.

## What does it do?

EManager is a desktop management application that allows users to create, track, and manage entries (expenses, events, or records) with calendar-based filtering. It leverages the JCalendar library for an intuitive date-picker interface, making time-based record management straightforward.

## Features

- Add, update, and delete managed entries
- Calendar integration via JCalendar for date selection and filtering
- Organized package structure for clean separation of logic
- Desktop GUI built with Java Swing

## Tech Stack

- **Language:** Java
- **UI Framework:** Java Swing
- **Library:** JCalendar 1.4 (`jcalendar-1.4.jar`)
- **IDE:** Eclipse

## Getting Started

### Prerequisites

- Java JDK 8 or above
- Eclipse or any Java IDE

### Run

1. Clone the repository
   ```
   git clone https://github.com/saptarshiroy2007-sketch/EManager.git
   ```
2. Open in Eclipse
3. Add `jcalendar-1.4.jar` to your build path:
   - Right-click project → Build Path → Add External JARs → select `jcalendar-1.4.jar`
4. Run the main class inside `src/comSR/`

## File Structure

```
EManager/
├── src/comSR/          # Source files
├── bin/comSR/          # Compiled classes
├── jcalendar-1.4.jar   # Calendar library dependency
└── .classpath
```

## Roadmap

- [ ] Export entries to CSV/Excel
- [ ] Recurring entry support
- [ ] Search and filter by date range
- [ ] Category tagging for entries

## Author

**Saptarshi Roy** — [GitHub](https://github.com/saptarshiroy2007-sketch)
