.class final Lcom/google/android/gms/internal/ads/y8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/to;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/s8;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/w8;Lcom/google/android/gms/internal/ads/s8;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/y8;->a:Lcom/google/android/gms/internal/ads/s8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    const-string v0, "Rejecting reference for JS Engine."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/y8;->a:Lcom/google/android/gms/internal/ads/s8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/yo;->b()V

    return-void
.end method
