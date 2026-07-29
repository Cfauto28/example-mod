# Cypress Fabric Template Mod

The official Cypress Fabric (based on the OrnitheMC) template mod. You can use it as a template for your own mods!

## Usage

In order to use this mod as a template:


1. Download the cypress jar and move it into the 'repo/com/mojang/minecraft/a1.0.16.05_20/' folder
 and rename it to minecraft-a1.0.16.05_20.jar
2. Run a python web server in the repo folder using <code>python -m http.server 5500 --bind 127.0.0.1</code>
3. Clone the recently-created repo on your PC
4. Make the necessary changes in order to make it yours:
    - Update `gradle.properties` in order to use your 
        - Update your mod's Maven group and mod ID
            - If you don't know which Maven group to use, and you are planning to host the mod's source code on GitHub, use `io.github.<Your_Username_Here>`
        - Update your mod's dependencies
            - Check [our develop page](https://ornithemc.net/develop) for the latest available versions.
    - Update `fabric.mod.json` in order to reflect your mod's metadata
        - If you are planning to include (jar-in-jar) a mod, don't forget to declare its dependency on it!
        - The icon provided here is a placeholder one. If you aren't able to replace it yet, you can delete it and remove the "icon" property
    - Create a LICENSE file for this mod! If you don't know which license to use, check out [here](https://choosealicense.com/).
        - If you use `LICENSE.md`, don't forget to update the buildscript in order to use that file name!
        - In `fabric.mod.json`, don't forget to put the license's [SPDX identifier](https://spdx.org/licenses/) under the `"license"` property`.
        - The GPLv3 and AGPLv3 are not valid mod licenses, so you can use almost any license except for those.
    - Update the Java sub-directory structure so it reflects your Maven group
5. The mod is now ready to be worked on!

## License

This template on the Cfauto GitHub is licensed under the [Creative Common Zero v1.0 license](./LICENSE-TEMPLATE.md).

Mods created with this template are not automatically licensed under the CC0, and are not required to give any kind of credit back to OrnitheMC or Cfauto for this template.
