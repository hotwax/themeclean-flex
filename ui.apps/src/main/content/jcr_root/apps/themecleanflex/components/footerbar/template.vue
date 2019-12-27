<template>
  <themecleanflex-components-block v-bind:model="model">
    <div class="p-5" v-if="isEditAndEmpty">no content defined for component</div>
    <div class="w-full" v-else>
      <div class="flex flex-col lg:flex-row justify-between">
        <div class="footer-col flex-1 lg:mx-4" v-for="(item,i) in model.columns"
        :key="i">
          <h1 class="text-xl my-2" v-if="item.title !== ''">{{item.title}}</h1>
          <div v-if="item.text !== ''" v-html="item.text"></div>
        </div>
      </div>
      <hr class="border-b">
      <div class="flex items-center flex-wrap justify-between">
        <p class="my-3" v-html="model.copyright"></p>
        <div class="flex justify-center -m-1">
          <a class="m-1" v-for="(item,i) in model.icons" :key="i" v-bind:href="$helper.pathToUrl(item.url)"
          v-bind:title="item.iconalttext">
            <svg class="fill-current" viewBox="0 0 24 24" style="width: 25px;">
              <use v-bind="{'xlink:href':`#${item.icon}`}" v-bind:href="`#${item.icon}`"
              />
            </svg>
          </a>
        </div>
      </div>
    </div>
  </themecleanflex-components-block>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

