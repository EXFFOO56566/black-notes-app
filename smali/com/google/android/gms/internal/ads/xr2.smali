.class final synthetic Lcom/google/android/gms/internal/ads/xr2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/nl1;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/vr2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/vr2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xr2;->a:Lcom/google/android/gms/internal/ads/vr2;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xr2;->a:Lcom/google/android/gms/internal/ads/vr2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/vr2;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
