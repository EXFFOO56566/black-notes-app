.class final synthetic Lcom/google/android/gms/internal/ads/wo0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/uo0;

.field private final c:Lcom/google/android/gms/internal/ads/ro;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/uo0;Lcom/google/android/gms/internal/ads/ro;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wo0;->b:Lcom/google/android/gms/internal/ads/uo0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/wo0;->c:Lcom/google/android/gms/internal/ads/ro;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wo0;->b:Lcom/google/android/gms/internal/ads/uo0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wo0;->c:Lcom/google/android/gms/internal/ads/ro;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/uo0;->a(Lcom/google/android/gms/internal/ads/ro;)V

    return-void
.end method
