# AstroAPI
Astro API is used for Astro Anticheat which can be purchased at https://astroac.cc

## Events
- `AstroFlagEvent` - Called whenever Astro flags a player.
- `AstroGhostBlockEvent` - Called when Astro detects a player on a ghost block.
- `AstroPunishEvent` - Called when Astro punishes a player.

## Installation
#### Maven:
```xml
<repository>
    <id>jitpack.io</id>
    <url>https://www.jitpack.io</url>
</repository>

<dependency>
    <groupId>com.github.Astro-Anticheat</groupId>
    <artifactId>AstroAPI</artifactId>
    <version>main-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

#### Gradle:
```xml
maven { url 'https://www.jitpack.io' }

implementation 'com.github.Astro-Anticheat:main-SNAPSHOT:VERSION'
```


