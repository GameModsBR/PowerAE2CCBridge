### 1.1.0.0-1.20.1-FABRIC

_Released 2023 Nov 10_

#### Requirements
- **Applied Energistics 2:** 15.0.13
- **CC:tweaked:** 1.108.3
- **Fabric API:** 0.85.0+1.20.1

#### Features
- New Api
    - Added `getAllCraftingRequests` to get all crafting requests made in the
      ME system[
- Now the system consumes channels from the ME system

#### Changes
- Increase energy cost of the peripheral from 1 to 5

---

### 1.0.0-1.18.2-FABRIC-0.2

_Released 2022 Dec 16_

#### Requirements
- **Applied Energistics 2:** 11.6.6
- **CC:Restitched:** 1.100.8
- **Fabric API:** 0.59.0+1.18.2

#### Fixes

- Fixed an issue that caused a wrong (unusable) version of the mod to be
  published to CurseForge.
    - This did not affect Modrinth as that publication is still manual.
- Fixed an issue that caused embedded version information to become outdated.


---

### 1.0.0-1.18.2-FABRIC-0.1

_Released 2022 Dec 16_

#### Requirements
- **Applied Energistics 2:** 11.6.6
- **CC:Restitched:** 1.100.8
- **Fabric API:** 0.59.0+1.18.2

#### Fixes

- Fixed an issue which prevented some cancellation reasons to not be relayed to
  the user.
- Fixed an issue that caused the mod version to not be reported properly in some
  cases.


---

### 1.0.0-1.18.2-FABRIC-0.0

_Released 2022 Dec 15_

#### Requirements
- **Applied Energistics 2:** 11.6.6
- **CC:Restitched:** 1.100.8
- **Fabric API:** 0.59.0+1.18.2

#### Overview

AE2CC Bridge adds a simple peripheral block that may be used to access an [Applied Energistics 2](https://github.com/AppliedEnergistics/Applied-Energistics-2)
ME system from [ComputerCraft](https://github.com/cc-tweaked/cc-restitched) computers.

Keep in mind that this mod is slightly unbalanced by design as the peripheral
access to the ME system allows you to circumvent some channel limitations at
practically no energy cost.

> **Note**: Currently, the peripheral only exposes a fairly small API. If you
> find that functionality you need is missing, please file a feature request in
> our issue tracker.