<template>
  <div :class = "'nav-menu-item-level-'+navItemLevel" v-bind:data-per-path="model.path">
    <pagerender-vue-components-placeholder v-bind:model="{ path: model.path, component: model.title, location: 'before' }">
    </pagerender-vue-components-placeholder>
    <a v-html="model.title"></a>
    <template v-for="child in model.children">
      <component v-bind:is="child.component" v-bind:model="child"></component>
    </template>
    <pagerender-vue-components-placeholder v-bind:model="{ path: model.path, component: model.title, location: 'after' }">
    </pagerender-vue-components-placeholder>
  </div>
</template>

<script>
    export default {
        props: ['model'],
        data () {
          return {
             navItemLevel: '0'
          }
        },
        created(){
           this.navItemLevel = (this.model.path.split("/").length).toString();
        }
    }
</script>

<style>

    /*
        Below are the styles for Navigation hierarchy.
        It will style the navigation item based on it's level.
        The code in template above have "'nav-menu-item-level-'+navItemLevel", which use these classes.
    */

    .nav-menu-item-level-3 {
        padding-left: 20px;
    }
    .nav-menu-item-level-4 {
        padding-left: 40px;
    }
    .nav-menu-item-level-5 {
        padding-left: 60px;
    }
    .nav-menu-item-level-6 {
        padding-left: 80px;
    }
    .nav-menu-item-level-7 {
        padding-left: 100px;
    }
    .nav-menu-item-level-8 {
        padding-left: 120px;
    }
    .nav-menu-item-level-9 {
        padding-left: 140px;
    }
    .nav-menu-item-level-10 {
        padding-left: 160px;
    }
</style>
