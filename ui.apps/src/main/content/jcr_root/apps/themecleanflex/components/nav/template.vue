<template>
  <div :class = "'nav-menu-item-level-'+count" v-bind:data-per-path="model.path">
    <pagerender-vue-components-placeholder v-bind:model="{ path: model.path, component: model.component, location: 'before' }"></pagerender-vue-components-placeholder>
    <a v-html="model.title"></a>
    <template v-for="child in model.children">
      <component v-bind:is="child.component" v-bind:model="child"></component>
    </template>
    <pagerender-vue-components-placeholder v-bind:model="{ path: model.path, component: model.component, location: 'after' }"></pagerender-vue-components-placeholder>
  </div>
</template>

<script>
    export default {
        props: ['model'],
        data () {
          return {
             count: '0'
          }
        },
        created(){
           var modelPath = this.model.path
           this.count = (modelPath.split("/").length).toString();
        }
    }
</script>

