<template>
  <div class="flex min-h-1 container mx-auto" v-bind:data-per-path="model.path">
    <h1 class="text-3xl font-semibold">{{model.title}}</h1>
  </div>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

