<template>
  <themecleanflex-components-block v-bind:model="model">
    <div class="p-5" v-if="isEditAndEmpty">no content defined for component</div>
    <div class="flex justify-center -m-1"
    v-else>
      <a class="m-1" v-for="(item,i) in model.icons" :key="i" v-bind:href="$helper.pathToUrl(item.url)">
        <svg class="fill-current" viewBox="0 0 24 24" style="width: 35px;">
          <use v-bind="{'xlink:href':`#${item.icon}`}" v-bind:href="`#${item.icon}`"
          />
        </svg>
      </a>
    </div>
  </themecleanflex-components-block>
</template>

<script>
    export default {
        props: ['model'],
        computed: {
          isEditAndEmpty() {
              if(!$peregrineApp.isAuthorMode()) return false
              return this.$helper.areAllEmpty(this.model.icons)
          }
        }
    }
</script>

