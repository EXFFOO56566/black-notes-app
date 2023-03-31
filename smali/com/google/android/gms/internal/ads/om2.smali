.class public final Lcom/google/android/gms/internal/ads/om2;
.super Lcom/google/android/gms/internal/ads/lo2;
.source ""


# instance fields
.field private final b:Lcom/google/android/gms/ads/x/a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/x/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/lo2;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/om2;->b:Lcom/google/android/gms/ads/x/a;

    return-void
.end method


# virtual methods
.method public final O()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/om2;->b:Lcom/google/android/gms/ads/x/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/x/a;->a()V

    :cond_0
    return-void
.end method
