.class final synthetic Lcom/google/android/gms/internal/ads/y01;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/o01;

.field private final c:[Lcom/google/android/gms/internal/ads/jj0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/o01;[Lcom/google/android/gms/internal/ads/jj0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/y01;->b:Lcom/google/android/gms/internal/ads/o01;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/y01;->c:[Lcom/google/android/gms/internal/ads/jj0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/y01;->b:Lcom/google/android/gms/internal/ads/o01;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/y01;->c:[Lcom/google/android/gms/internal/ads/jj0;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/o01;->a([Lcom/google/android/gms/internal/ads/jj0;)V

    return-void
.end method
