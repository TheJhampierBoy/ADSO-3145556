# Informe 2 – Commits del repositorio TuEvento

| Campo | Dato |
|---|---|
| Aprendiz | Jhampier Santos Ortiz |
| Usuario GitHub | TheJhampierBoy |
| Ficha | 3145556 (ADSO) |
| Proyecto | Tu Evento |
| Prefijo | yev- |
| Correo(s) de commit | ortizjhampier@gmail.com |
| Periodo revisado | 11 de agosto de 2026 al 30 de septiembre de 2026, de lunes a viernes |
| Fecha de elaboración | 6 de octubre de 2026 |

## 1. Resumen de repositorios

| # | Repositorio | Enlace | Tipo | Visibilidad | Commits |
|---|---|---|---|---|---|
| 1 | TuEvento | https://github.com/lozano2303/TuEvento | Personal | Pública | 40 |

## 2. Detalle por repositorio

### 2.1 TuEvento

- **Enlace:** https://github.com/lozano2303/TuEvento
- **Tipo:** Personal
- **Visibilidad:** Pública (el instructor `ariel5253` puede verlo)
- **Total de commits en el periodo (lunes a viernes):** 40
- **Días con commits:** 15 de los 37 días laborales del periodo
- **Descripción:** Código del proyecto Tu Evento: aplicación web, móvil y backend para gestión de eventos. Los commits cubren plantillas de correo HTML y sistema de temas, desactivación y reactivación de cuenta, inicio de sesión con Google y corrección de OAuth con Facebook, traducción de mensajes de error al español, panel de administración de eventos y su rediseño, perfil de usuario (filtro de biografía, validación de nombre), carga y recorte de imágenes de eventos con validación de mínimo 3 y máximo 9 imágenes, migración de colores a tokens de tema, y páginas de términos de uso y política de privacidad.
- **Ramas:** todas. Los 40 commits aparecen en las mismas 9 ramas y se cuentan una sola vez: `develop`, `feat/admin-event-sections-detail`, `feat/event-comments-delete`, `feat/event-comments-websocket`, `feat/event-review-flow-admin`, `feat/event-review-flow-backend`, `feat/event-review-flow-frontend`, `feat/event-review-notifications` y `feature/language-translation-service-integration`.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| [4ba2993d4ef59f0d861e5c7c99181e2cd97ea902](https://github.com/lozano2303/TuEvento/commit/4ba2993d4ef59f0d861e5c7c99181e2cd97ea902) | 2026-08-25 16:15 | feat: HTML email templates, theming system, UI polish and infra updates |
| [e7a48eef49bede9f3ef94c330f71844bcfd3569a](https://github.com/lozano2303/TuEvento/commit/e7a48eef49bede9f3ef94c330f71844bcfd3569a) | 2026-08-26 15:59 | feat(security): add deactivate account endpoint and confirmation modal |
| [264df3276225304fa8b67dee66a304a01e156dba](https://github.com/lozano2303/TuEvento/commit/264df3276225304fa8b67dee66a304a01e156dba) | 2026-08-26 16:16 | style(modal): migrate DeactivateAccountModal to BaseModal, add bm-btn-danger variant |
| [58b929edbbfd266664ee5ff2cac12eb770f71254](https://github.com/lozano2303/TuEvento/commit/58b929edbbfd266664ee5ff2cac12eb770f71254) | 2026-08-26 16:28 | style(deactivate-modal): full premium redesign with glassmorphism and purple identity |
| [0580110ac1c5fef43bd28e9bcc5e79b119068ba2](https://github.com/lozano2303/TuEvento/commit/0580110ac1c5fef43bd28e9bcc5e79b119068ba2) | 2026-08-26 16:33 | style(deactivate-modal): remove icon above title and headphones support note |
| [54ed1cc791434635b79b3d526060c7955191c630](https://github.com/lozano2303/TuEvento/commit/54ed1cc791434635b79b3d526060c7955191c630) | 2026-08-26 16:40 | feat(profile): move deactivate button to themes column, clean security section |
| [71b80d79d4a3ff8734f9ae367e8b57fe7548ca6f](https://github.com/lozano2303/TuEvento/commit/71b80d79d4a3ff8734f9ae367e8b57fe7548ca6f) | 2026-08-27 13:37 | fix(deactivate-modal): integrar modal al sistema de temas |
| [9c8fccba159184a6af88202ba9611a2513cbd052](https://github.com/lozano2303/TuEvento/commit/9c8fccba159184a6af88202ba9611a2513cbd052) | 2026-08-27 13:58 | fix(profile-avatar): preserve previous photo on NSFW rejection and pass backend message through |
| [12133375d4d7c544380c01e4fd0f33eba7dbd2a6](https://github.com/lozano2303/TuEvento/commit/12133375d4d7c544380c01e4fd0f33eba7dbd2a6) | 2026-08-27 14:10 | fix(profile-avatar): fix default avatar showing as broken image / alt text |
| [aa3312cf6f07189696accd25df9b23e11bb2933e](https://github.com/lozano2303/TuEvento/commit/aa3312cf6f07189696accd25df9b23e11bb2933e) | 2026-08-27 14:49 | i18n(backend): translate all user-facing error messages to Spanish |
| [bddabca0402ee2d8ac222556f40043d531f3f9c5](https://github.com/lozano2303/TuEvento/commit/bddabca0402ee2d8ac222556f40043d531f3f9c5) | 2026-08-27 14:57 | fix(deactivate-modal): translate backend error to Spanish, increase security note contrast |
| [76161e890b5a57cb068bcc1811eb2f30b77e2683](https://github.com/lozano2303/TuEvento/commit/76161e890b5a57cb068bcc1811eb2f30b77e2683) | 2026-08-27 16:29 | fix(login): translate all LoginUseCase error messages to Spanish |
| [4d1b1560ef7038276386cb87ef9f98e2820426ba](https://github.com/lozano2303/TuEvento/commit/4d1b1560ef7038276386cb87ef9f98e2820426ba) | 2026-08-27 16:51 | fix(login): update ACCOUNT_INACTIVE message to prompt reactivation request |
| [bac6ee5108a1603ae1b1b571cc5b31aaac602cde](https://github.com/lozano2303/TuEvento/commit/bac6ee5108a1603ae1b1b571cc5b31aaac602cde) | 2026-08-31 14:02 | feat(reactivation): implement full account reactivation flow |
| [770f328fa2eb02d1ca516f525be83b318a9fc3f2](https://github.com/lozano2303/TuEvento/commit/770f328fa2eb02d1ca516f525be83b318a9fc3f2) | 2026-09-01 13:21 | feat(reactivation-modal): add verify step — enter code inline, no page redirect |
| [366b0ebebb813dfbddec8d3ff98d82ebeda78986](https://github.com/lozano2303/TuEvento/commit/366b0ebebb813dfbddec8d3ff98d82ebeda78986) | 2026-09-01 13:28 | style(email): remove lightning, clock and shield emojis from reactivation template |
| [007932ff7520f33adfe8be03c3ae99b45e87a2e5](https://github.com/lozano2303/TuEvento/commit/007932ff7520f33adfe8be03c3ae99b45e87a2e5) | 2026-09-01 14:31 | feat(auth): Google Sign-In (GSI id_token) + fix YAML config + fix OAuth role |
| [12f0ce038092f42c029014207bd0652beb608ba9](https://github.com/lozano2303/TuEvento/commit/12f0ce038092f42c029014207bd0652beb608ba9) | 2026-09-04 16:52 | fix(google-auth): rewrite token verifier to fix 'usar otra cuenta' failure |
| [45cb22697df84216b05fd9aeff66380e1e69e377](https://github.com/lozano2303/TuEvento/commit/45cb22697df84216b05fd9aeff66380e1e69e377) | 2026-09-04 17:07 | diag(google-auth): add temporary log of raw aud/iss claims in both GSI flows |
| [bba2b7c7d1f4ec7cda8b707db96122bacc7d8f28](https://github.com/lozano2303/TuEvento/commit/bba2b7c7d1f4ec7cda8b707db96122bacc7d8f28) | 2026-09-04 17:25 | fix(login): replace GoogleLogin component with custom button matching Facebook size |
| [aaabfacfcdb503493c06336497d7ac5805c13d5a](https://github.com/lozano2303/TuEvento/commit/aaabfacfcdb503493c06336497d7ac5805c13d5a) | 2026-09-04 17:35 | fix(login): revert GoogleButton to overlay technique — uses real GoogleLogin |
| [18c790993a14b83624437e477fbdaef19da9ecec](https://github.com/lozano2303/TuEvento/commit/18c790993a14b83624437e477fbdaef19da9ecec) | 2026-09-07 13:51 | refactor(security): update security and profile use cases |
| [129740612df238f1dd1a97dfa081dd57400ccec2](https://github.com/lozano2303/TuEvento/commit/129740612df238f1dd1a97dfa081dd57400ccec2) | 2026-09-09 15:38 | feat: Google OAuth onboarding, document type in organizer petitions, avatar fix |
| [a5efb11938357e594504562bbf9600ff225f3b24](https://github.com/lozano2303/TuEvento/commit/a5efb11938357e594504562bbf9600ff225f3b24) | 2026-09-11 17:20 | feat: add admin event management panel |
| [39573e0747dbff4c987c48d7dfcc65c66a95d351](https://github.com/lozano2303/TuEvento/commit/39573e0747dbff4c987c48d7dfcc65c66a95d351) | 2026-09-17 13:26 | feat(admin): improve event management UI and add wallet page |
| [88c831b5302f5e6789935620a855aef995dfae64](https://github.com/lozano2303/TuEvento/commit/88c831b5302f5e6789935620a855aef995dfae64) | 2026-09-17 13:26 | feat(profile): add bio filter, fullName validation, and 14-day name cooldown |
| [311f2448534b910e7628223d67e25e5f266779a9](https://github.com/lozano2303/TuEvento/commit/311f2448534b910e7628223d67e25e5f266779a9) | 2026-09-21 13:55 | fix: OAuth Facebook null email fallback and secure redirect whitelist |
| [dc26e48ad186358951b6ac1e7d009b9ee4709623](https://github.com/lozano2303/TuEvento/commit/dc26e48ad186358951b6ac1e7d009b9ee4709623) | 2026-09-21 13:55 | feat: replace window.confirm with ConfirmModal in AdminPanel and update OAuth mobile flow |
| [0c9971c0e8e2dbeda1f9a9879ed869e1ac8307e2](https://github.com/lozano2303/TuEvento/commit/0c9971c0e8e2dbeda1f9a9879ed869e1ac8307e2) | 2026-09-22 13:45 | fix(event-media): fix zoom/crop bug in event image upload and gallery |
| [6b702359727596ad5da62a6d7eb7e308f7efa1fb](https://github.com/lozano2303/TuEvento/commit/6b702359727596ad5da62a6d7eb7e308f7efa1fb) | 2026-09-22 14:10 | feat(event): enforce min 3 / max 9 images before publishing |
| [688cb70fd0feaf2fd346518d4e2b4f406a2b3245](https://github.com/lozano2303/TuEvento/commit/688cb70fd0feaf2fd346518d4e2b4f406a2b3245) | 2026-09-22 14:15 | fix(image-normalize): move URL.revokeObjectURL to toBlob callback |
| [c663779397c1ed507dd744504de84de19fe811d8](https://github.com/lozano2303/TuEvento/commit/c663779397c1ed507dd744504de84de19fe811d8) | 2026-09-22 14:31 | fix(image-normalize): fix NaN canvas dimensions from bare .map() reference |
| [0ee0032ccfff640ea1e3ba8b364b9a92ffc6a6ff](https://github.com/lozano2303/TuEvento/commit/0ee0032ccfff640ea1e3ba8b364b9a92ffc6a6ff) | 2026-09-23 15:50 | style(admin): migrate hardcoded purple colors to theme tokens |
| [27fdca2d8657afe510cb0bb69f7e3113552c5f2e](https://github.com/lozano2303/TuEvento/commit/27fdca2d8657afe510cb0bb69f7e3113552c5f2e) | 2026-09-23 15:50 | style(admin-event-modal): redesign detail modal with hero header, diagonal cut, angular badges and section groups |
| [d86684b5161ca5f35fca11136091801f0eda3fa5](https://github.com/lozano2303/TuEvento/commit/d86684b5161ca5f35fca11136091801f0eda3fa5) | 2026-09-23 15:50 | fix(organizer-form): remove document type selector section |
| [941309e3b59a9b347870e9de5ec4decf1d943e3f](https://github.com/lozano2303/TuEvento/commit/941309e3b59a9b347870e9de5ec4decf1d943e3f) | 2026-09-23 15:54 | feat(event-manage): add event detail modal with hero gallery and publish action |
| [5fda0e9b669c3183172beeaccb4f480f37f39672](https://github.com/lozano2303/TuEvento/commit/5fda0e9b669c3183172beeaccb4f480f37f39672) | 2026-09-23 15:55 | style(auth): replace login hero image with full-cover layout across login, code-verification and forgot-password pages |
| [d12fdcb1a0252509e54196265e31ce6132b5da94](https://github.com/lozano2303/TuEvento/commit/d12fdcb1a0252509e54196265e31ce6132b5da94) | 2026-09-23 16:04 | fix(backend): update application config and db migration scripts |
| [7903c4c88142722c4c6e4f96c6cfeaab4653b8e6](https://github.com/lozano2303/TuEvento/commit/7903c4c88142722c4c6e4f96c6cfeaab4653b8e6) | 2026-09-24 13:33 | feat(legal): add terms-of-use and privacy-policy pages with real content |
| [412aa6473c97ea362bc60d5021b19ffdc0be0fdc](https://github.com/lozano2303/TuEvento/commit/412aa6473c97ea362bc60d5021b19ffdc0be0fdc) | 2026-09-28 16:21 | feat(legal): add terms and privacy content |

### Commits por día

| Fecha | Día | Commits |
|---|---|---|
| 2026-08-25 | Martes | 1 |
| 2026-08-26 | Miércoles | 5 |
| 2026-08-27 | Jueves | 7 |
| 2026-08-31 | Lunes | 1 |
| 2026-09-01 | Martes | 3 |
| 2026-09-04 | Viernes | 4 |
| 2026-09-07 | Lunes | 1 |
| 2026-09-09 | Miércoles | 1 |
| 2026-09-11 | Viernes | 1 |
| 2026-09-17 | Jueves | 2 |
| 2026-09-21 | Lunes | 2 |
| 2026-09-22 | Martes | 4 |
| 2026-09-23 | Miércoles | 6 |
| 2026-09-24 | Jueves | 1 |
| 2026-09-28 | Lunes | 1 |
| **Total** | | **40** |

No hay commits entre el 11 y el 24 de agosto. No hay commits en sábado ni domingo.

## 3. Verificación del aprendiz

- [ ] Los enlaces de los commits abren directamente en GitHub.
- [ ] Se revisaron todas las ramas, no solo main.
- [ ] Cada commit aparece una sola vez, aunque esté en varias ramas.
- [ ] Se excluyeron los merges.
- [ ] Los commits corresponden a mi cuenta (aparece mi foto de perfil en GitHub).
- [ ] Los repositorios sin commits quedaron en la tabla con 0.
- [ ] Indiqué si el instructor tiene acceso a los repositorios privados.

## 4. Observaciones

- El filtro del periodo es de lunes a viernes, del 11 de agosto al 30 de septiembre de 2026.
- El autor aparece en el historial como "Jhampier" con el correo ortizjhampier@gmail.com, que corresponde a mi cuenta TheJhampierBoy.
- El repositorio es público, no hay repositorios privados en este informe.
